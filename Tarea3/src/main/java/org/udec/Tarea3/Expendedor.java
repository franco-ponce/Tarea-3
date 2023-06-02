package org.udec.Tarea3;
public class Expendedor {
    private Deposito<Bebida> coca;
    private Deposito<Bebida> sprite;
    private Deposito<Dulces> snicker;
    private Deposito<Dulces> super8;
    private Deposito<Moneda> MonVu;
    private int vuelto;
    private PrecioProducto precio;

    public enum ProductoEnum {COCA, SPRITE, SNICKER, SUPER8}
    public enum PrecioProducto {
        COCA(1200),
        SPRITE(1000),
        SNICKER(500),
        SUPER8(400);

        private int precio;

        PrecioProducto(int precio) {
            this.precio = precio;
        }
        public int getPrecio() {
            return precio;
        }
    }

    public Expendedor(int numProducto) {
        this.vuelto = 0;
        this.coca = new Deposito<>();
        this.sprite = new Deposito<>();
        this.snicker = new Deposito<>();
        this.super8 = new Deposito<>();
        this.MonVu = new Deposito<>();
        for (int i = 0; i < numProducto; i++) {
            sprite.addDeposito(new Sprite(200 + i));
            coca.addDeposito(new CocaCola(100 + i));
            snicker.addDeposito(new Snicker(300 + i));
            super8.addDeposito(new Super8(400 + i));
        }
    }

    public Producto comprarProducto(Moneda m, ProductoEnum producto) throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException {
        if (m == null) {
            throw new PagoIncorrectoException("Tienes que ingresar una moneda");
        } else {
            if (coca.sizeDep() == 0 && sprite.sizeDep() == 0 && snicker.sizeDep() == 0 && super8.sizeDep() == 0) {
                MonVu.addDeposito(m);
                throw new NoHayProductoException("No quedan productos");
            } else {
                int a = m.getSerie().getValor();
                int precio = PrecioProducto.valueOf(producto.name()).getPrecio();
                if (a < precio) {
                    MonVu.addDeposito(m);
                    throw new PagoInsuficienteException("El dinero no es suficiente");
                } else if (a >= precio) {
                    if (producto == ProductoEnum.COCA) {
                        Bebida b = coca.getDeposito();
                        if (b == null) {
                            MonVu.addDeposito(m);
                            throw new NoHayProductoException("No quedan CocaColas");
                        } else {
                            vuelto = a - precio;
                            while (vuelto != 0) {
                                MonVu.addDeposito(new Moneda100());
                                vuelto = vuelto - 100;
                            }
                            return b;
                        }
                    } else if (producto == ProductoEnum.SPRITE) {
                        Bebida c = sprite.getDeposito();
                        if (c == null) {
                            MonVu.addDeposito(m);
                            throw new NoHayProductoException("No quedan Sprite");
                        } else {
                            vuelto = a - precio;
                            while (vuelto != 0) {
                                MonVu.addDeposito(new Moneda100());
                                vuelto = vuelto - 100;
                            }
                            return c;
                        }
                    } else if (producto == ProductoEnum.SNICKER) {
                        Dulces d = snicker.getDeposito();
                        if (d == null) {
                            MonVu.addDeposito(m);
                            throw new NoHayProductoException("No quedan Snicker");
                        } else {
                            vuelto = a - precio;
                            while (vuelto != 0) {
                                MonVu.addDeposito(new Moneda100());
                                vuelto = vuelto - 100;
                            }
                            return d;
                        }
                    } else if (producto == ProductoEnum.SUPER8) {
                        Dulces f = super8.getDeposito();
                        if (f == null) {
                            MonVu.addDeposito(m);
                            throw new NoHayProductoException("No quedan Super 8");
                        } else {
                            vuelto = a - precio;
                            while (vuelto != 0) {
                                MonVu.addDeposito(new Moneda100());
                                vuelto = vuelto - 100;
                            }
                            return f;
                        }
                    } else {
                        MonVu.addDeposito(m);
                        throw new NoHayProductoException("No existe este producto");
                    }
                }
            }
        }
        return null;
    }
    public Moneda getVuelto() {
        return MonVu.getDeposito();
    }
}


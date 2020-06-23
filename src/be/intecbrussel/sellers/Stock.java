package be.intecbrussel.sellers;

public class Stock extends IceCreamCar{
    int iceRockets;
    int cones;
    int balls;
    int magni;
// zeer verward geraakt met de stock klasse!
    public Stock(iceRockets iR, cones c, balls b, magni m) {
        super(stock);
    }

    public int getIceRockets() {
        return iceRockets;
    }

    public void setIceRockets(int iceRockets) {
        this.iceRockets = iceRockets;
    }

    public int getCones() {
        return cones;
    }

    public void setCones(int cones) {
        this.cones = cones;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public int getMagni() {
        return magni;
    }

    public void setMagni(int magni) {
        this.magni = magni;
    }
}

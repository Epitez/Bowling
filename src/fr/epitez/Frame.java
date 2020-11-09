package fr.epitez;

public class Frame {

    protected Lancer[] lancers;
    private int numeroDeLancer;

    public Frame() {
        this.lancers = new Lancer[2];
        this.numeroDeLancer = 0;
    }

    public void Lancer(int quille) {
        this.lancers[numeroDeLancer++] = new Lancer(quille);
    }

    // Methodes privées au pakage pour les tests
    Lancer getLancer(int index) {
        return this.lancers[index];
    }
}

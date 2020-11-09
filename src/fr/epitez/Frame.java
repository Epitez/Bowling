package fr.epitez;

public class Frame {

    protected Lancer[] lancers;

    public Frame() {
        this.lancers = new Lancer[2];
    }

    public void Lancer(int quille) {
        this.lancers[0] = new Lancer(quille);
    }

    // Methodes privées au pakage pour les tests
    Lancer getLancer(int index) {
        return this.lancers[index];
    }
}

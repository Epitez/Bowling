package fr.epitez;

public class Frame {

    protected Lancer[] lancers;
    private int numeroDeLancer;
    private Frame frameSuivante;

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

    public int Score() throws ExceptionInInitializerError {
        int score = 0;
        switch ( this.numeroDeLancer ) {
            case 2:
                score = this.lancers[1].getQuilles();
            case 1:
                score += this.lancers[0].getQuilles();
                break;
            default:
                throw new ExceptionInInitializerError();
        }
        if(score == 10) {
            score += this.frameSuivante.lancers[0].getQuilles();
        }
        return score;
    }

    public void FrameSuivante(Frame frameSuivante) {
        this.frameSuivante = frameSuivante;
    }
}

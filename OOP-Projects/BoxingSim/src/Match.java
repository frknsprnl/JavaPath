public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    double start;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.start = pickFirst();
    }

    public void run() {
        if (isCheck()) {
            System.out.println("====== Ilk Round =======");
            if ( this.start >= 0 && this.start < 50 ){
                this.f2.health = this.f1.hit(f2);
                if (isWin()) {
                    System.out.println("Nakavt! ");
                    System.exit(0);
                }
                this.f1.health = this.f2.hit(f1);
                if (isWin()) {
                    System.out.println("Nakavt!");
                    System.exit(0);
                }
            } else if ( this.start >= 50 && this.start <= 100){
                this.f1.health = this.f2.hit(f1);
                if (isWin()) {
                    System.out.println("Nakavt! ");
                }
                this.f2.health = this.f1.hit(f2);
                if (isWin()) {
                    System.out.println("Nakavt! ");
                }
            }
            System.out.println(this.f1.name + " Saglik: " + this.f1.health);
            System.out.println(this.f2.name + " Saglik: " + this.f2.health);
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("====== Yeni Round =======");
                this.f2.health = this.f1.hit(f2);
                if (isWin()) {
                    break;
                }
                this.f1.health = this.f2.hit(f1);
                if (isWin()) {
                    break;
                }
                System.out.println(this.f1.name + " Saglik: " + this.f1.health);
                System.out.println(this.f2.name + " Saglik: " + this.f2.health);
            }

        } else {
            System.out.println("Sporcularin sikletleri uymuyor.");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);

    }

    boolean isWin() {

        if (this.f1.health <= 0) {

            System.out.println(f2.name + " maci kazandi!");
            return true;
        }

        if (this.f2.health <= 0) {

            System.out.println(f1.name + " maci kazandi!");
            return true;
        }
        return false;
    }
    // this function is for picking who will start in first round.
    double pickFirst() {
        double randomNumber = Math.random() * 100;
        return randomNumber;
    }
}

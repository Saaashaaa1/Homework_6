public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    void greets() {
        System.out.println("Woow");
    }

    void greets(Dog another) {
        System.out.println("Woooooooow");
    }
        void greets(BigDog another){
            System.out.println("Wooooooooooooooow");
        }

}

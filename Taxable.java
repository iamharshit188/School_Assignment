class Taxable extends Item{
    double tax;
    double totamt;
    public Taxable(String n, int c, double a){
        super(n, c, a);
        totamt = 0.0;
        tax = 0.0;
    }

    public void calTax(){
        tax = 10.2 / 100 * amount;
        totamt = amount + tax;
    }

    public void show(){
        super.show();
        System.out.println("Total amount: " + totamt);
    }
}
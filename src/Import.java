public class Import {
    public static void main(String[] args) {
        /*
        If you live in Armenia and want to buy and import a product to Armenia (Amazon/Ebay etc.).
        This program helps you calculate the total cost of the product, tax included.
         */
        double x = 1295;
        print(x);
    }

    public static double convert (double dram)  { return (dram*418); }

    public static double tax(double dram) {
        if (convert(dram) > 200_000) {
            return ((convert(dram) - 200_000) * 0.15);}
        else {
            return 0; }}

    public static double allFees(double dram){
        if (convert(dram) > 200_000) {
            double inflated = ((convert(dram)-200_000) * 0.15);
            return convert(dram) + inflated; }
        else { return convert(dram); } }

    public static void print(double dram) {
        System.out.println("USD: " + dram);
        System.out.println("Added Tax (AMD): " + tax(dram));
        System.out.println("Final price (AMD): " + allFees(dram));
        System.out.println("\n"); }

}


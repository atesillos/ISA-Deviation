class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        int height = 26000;
        double actualTemp = -30;
        double stdTemp = calcST(height);
        double isaT = calcISATemp(actualTemp, stdTemp);
        System.out.println(
            "Alititude: " + height + 
            "\nActual Temp: " + actualTemp + 
            "\nStandard Temp: " + stdTemp + 
            "\nISA Temp: " + isaT);
    } // main method

    /*
    * ISA temp at a certain altitude.
    * Height is to be measured in feet.
    * @param height 
    */
    static double calcST(int alt) {
        return (15 - ((alt/1000) * 1.98));
    }

    /*
    * ISA temperature deviation
    */
    static double calcISATemp (double AT, double ST) {
        return (ST - AT);
    }
    
} // main class

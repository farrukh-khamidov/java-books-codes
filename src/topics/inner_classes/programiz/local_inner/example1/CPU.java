package topics.inner_classes.programiz.local_inner.example1;

class CPU {
    double price = 5;
    // nested class

    void printProcessor() {

        int count = 10;


        int finalCount = count;
        class Processor{
            // members of nested class
            double cores;
            String manufacturer;


            double getCache(){
                return 4.3;
            }

            void printCount() {
                System.out.println(finalCount);
            }
        }

        Processor processor = new Processor();
        processor.printCount();
        count++;
    }


}

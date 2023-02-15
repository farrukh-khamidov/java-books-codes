package topics.inner_classes.programiz.static_nested.example4;

class MotherBoard {
    String model;

    public MotherBoard(String model) {
        this.model = model;
    }

    // static nested class
    static class USB{
        int usb2 = 2;
        int usb3 = 1;
        int getTotalPorts(){
            // accessing the variable model of the outer classs
            /*if(MotherBoard.this.model.equals("MSI")) {
                return 4;
            }*/
            /*else {*/
                return usb2 + usb3;
           /* }*/
        }
    }
}


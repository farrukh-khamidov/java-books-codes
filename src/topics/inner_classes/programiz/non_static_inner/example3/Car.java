package topics.inner_classes.programiz.non_static_inner.example3;

class Car {
    private String carName;
    private String carType;

    // assign values using constructor
    public Car(String name, String type) {
        this.carName = name;
        this.carType = type;
    }

    // private method
    private String getCarName() {
        return carName;
    }

    // inner class
    class Engine {
        private String engineType;
        void setEngine() {

            // Accessing the carType property of Car
            if(carType.equals("4WD")){

                // Invoking method getCarName() of Car
                if(getCarName().equals("Crysler")) {
                    engineType = "Smaller";
                } else {
                    engineType = "Bigger";
                }

            }else{
                engineType = "Bigger";
            }
        }
        public String getEngineType(){
            return engineType;
        }
    }
}

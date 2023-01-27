package transport;

    public class Car extends Transport {
        public static class Key {
            private final boolean keylessAccess;
            private final boolean remoteEngineStart;

            public Key(boolean keylessAccess, boolean remoteEngineStart) {
                this.keylessAccess = keylessAccess;
                this.remoteEngineStart = remoteEngineStart;
            }
            public boolean isKeylessAccess() {
                return keylessAccess;
            }
            public boolean isRemoteEngineStart() {
                return remoteEngineStart;
            }
            @Override
            public String toString() {
                return "Key{" +
                        "keylessAccess=" + keylessAccess +
                        ", remoteEngineStart=" + remoteEngineStart +
                        '}';
            }
        }

        private double engineVolume;
        private String transmission;
        private final String bodyType;
        private String registrationNumber;
        private final int seatsCount;
        private boolean summerTires;
        private Key key;

        private static final String defaultValue = "default";
        private static final double defaultEngineVolume = 1.5;
        private static final int defaultSeats = 5;

        public Car(String brand, String model, double engineVolume, String color, int year, String country,  int maximumSpeed,
                   String transmission, String bodyType, String registrationNumber, int seatsCount, int month, Key key) {
            super(brand, model, year, country, color, maximumSpeed);

            if (bodyType == null || bodyType.isBlank()) {
                this.bodyType = defaultValue;
            } else {
                this.bodyType = bodyType;
            }
            if (seatsCount <= 0) {
                this.seatsCount = defaultSeats;
            } else {
                this.seatsCount = seatsCount;
            }
            setEngineVolume(engineVolume);
            setTransmission(transmission);
            setRegistrationNumber(registrationNumber);
            setSummerTires(summerTires);
            this.key = key;
            changeSummerTires(month);
        }

        public double getEngineVolume() {
            return engineVolume;
        }
        public String getTransmission() {
            return transmission;
        }
        public String getBodyType() {
            return bodyType;
        }
        public String getRegistrationNumber() {
            return registrationNumber;
        }
        public int getSeatsCount() {
            return seatsCount;
        }
        public boolean isSummerTires() {
            return summerTires;
        }
        public void setEngineVolume(double engineVolume) {
            if (engineVolume <= 0) {
                this.engineVolume = defaultEngineVolume;
            } else {
                this.engineVolume = engineVolume;
            }
        }
        public void setTransmission(String transmission) {
            if (transmission == null || transmission.isBlank()) {
                this.transmission = defaultValue;
            } else {
                this.transmission = transmission;
            }
        }
        public void setRegistrationNumber(String registrationNumber) {
            if (registrationNumber == null || registrationNumber.isBlank()) {
                this.registrationNumber = defaultValue;
            } else {
                this.registrationNumber = registrationNumber;
            }
        }
        public void setSummerTires(boolean summerTires) {
            this.summerTires = summerTires;
        }
        public void changeSummerTires(int month) {
            setSummerTires(month >= 4 && month <= 10);
        }
        public Key getKey() {
            return key;
        }

        @Override
        public String toString() {
            return super.toString() + ", " + "Car{" +
                    "engineVolume=" + engineVolume +
                    ", transmission='" + transmission + '\'' +
                    ", bodyType='" + bodyType + '\'' +
                    ", registrationNumber='" + registrationNumber + '\'' +
                    ", seatsCount=" + seatsCount +
                    ", summerTires=" + summerTires +
                    ", key=" + key +
                    '}';
        }
    }


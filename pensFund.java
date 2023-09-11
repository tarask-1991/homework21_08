package org.example;

public class pensFund {


    public class pensionFund {
        private String govPens;
        private boolean isState;
        private int  creationDate;
        private int participationCount;

        public pensionFund(String govPens, boolean isState, int creationDate, int participationCount) {
            this.govPens = govPens;
            this.isState = isState;
            this.creationDate = creationDate;
            this.participationCount = participationCount;
        }

        public String getGovPens() {
            return govPens;
        }

        public void setGovPens(String govPens) {
            this.govPens = govPens;
        }

        public boolean isState() {
            return isState;
        }

        public void setState(boolean state) {
            isState = state;
        }

        public int getCreationDate() {
            return creationDate;
        }

        public void setCreationDate(int creationDate) {
            this.creationDate = creationDate;
        }

        public int getParticipationCount() {
            return participationCount;
        }

        public void setParticipationCount(int participationCount) {
            this.participationCount = participationCount;
        }

        public void info () {
            if (isState) {
                System.out.println("Gov Fund :" + participationCount/1000 + "thousands of persons");
            } else
                System.out.println("Gov Fund :" + participationCount + "persons");

        }

    }
}

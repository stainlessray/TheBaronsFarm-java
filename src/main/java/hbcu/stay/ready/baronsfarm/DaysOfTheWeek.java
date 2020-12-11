package hbcu.stay.ready.baronsfarm;

public enum DaysOfTheWeek {

    MONDAY {
        public DaysOfTheWeek day() {
            System.out.println(DaysOfTheWeek.MONDAY);
            return null;
        }
    },

    TUESDAY {
        public DaysOfTheWeek day() {
            return DaysOfTheWeek.TUESDAY;
        }
    },

    WEDNESDAY {
        public DaysOfTheWeek day() {
            return DaysOfTheWeek.WEDNESDAY;
        }
    },

    THURSDAY {
        public DaysOfTheWeek day() {
            System.out.println(DaysOfTheWeek.THURSDAY);
            return DaysOfTheWeek.THURSDAY;

        }
    },

    FRIDAY {
        public DaysOfTheWeek day() {
            return DaysOfTheWeek.FRIDAY;
        }
    },

    SATURDAY {
        public DaysOfTheWeek day() {
            return DaysOfTheWeek.SATURDAY;
        }
    },

    SUNDAY {
        public DaysOfTheWeek day() {
            return DaysOfTheWeek.SUNDAY;
        }

    };


    }

   /* public DaysOfTheWeek day() {
        for (DaysOfTheWeek day : DaysOfTheWeek.values()) {
            System.out.println(day);
        }
        return null;*/





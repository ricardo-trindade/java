package com.week;

import java.util.Scanner;

public enum WeekDays {

    MONDAY {
        @Override
        public String mensage() {
            return "Gym day";
        }
    },

    TUESDAY {
        @Override
        public String mensage() {
            return "English class day";
        }
    },

    WEDNESDAY {
        @Override
        public String mensage() {
            return "Box class day";
        }
    },

    THURSDAY {
        @Override
        public String mensage() {
            return "Programming class day";
        }
    },

    FRIDAY {
        @Override
        public String mensage() {
            return "Studies day";
        }
    },

    SATURDAY {
        @Override
        public String mensage() {
            return "Free day";
        }
    },

    SUNDAY {
        @Override
        public String mensage() {
            System.out.println("Rest day");
            ;
            return null;
        }
    };

    public String mensage() {
        System.out.println("Default mensage");
        return null;
    }

    public static void daysOptions() {
        System.out.println("What week day is it?" +
                "\n 0. Quit" +
                "\n 1 Monday" +
                "\n 2 Tuesday" +
                "\n 3 Wednesday" +
                "\n 4 Thursday" +
                "\n 5 Friday" +
                "\n 6 Saturday" +
                "\n 7 Sunday");
    }

    public static WeekDays fromNumber() {

        Scanner sc = new Scanner(System.in);
        while (true) {
            String number = sc.nextLine();

            if (number.length() != 1 || !Character.isDigit(number.charAt(0))) {
                System.out.println("Invalid element, try again");
                continue;
            }

            int option = Integer.parseInt(number);

            switch (option) {
                case 0:
                    System.out.println("Always come back");
                    System.exit(0);
                case 1: return MONDAY;
                case 2: return TUESDAY;
                case 3: return WEDNESDAY;
                case 4: return THURSDAY;
                case 5: return FRIDAY;
                case 6: return SATURDAY;
                case 7: return SUNDAY;
                default:
                    System.out.println("Invalid day, try again");
                    continue;
            }
        }
    }
}


package com.company;

public class Main {
    interface _380w{
        void charge_380w(); //клиентский интерфейс
    }

    interface _220w{
        void charge_220w(); //клинтский интерфейс
    }
    static class _220class implements _220w{
        @Override
        public void charge_220w() {
            System.out.println("220w ");
        }
    }

    static class _380class implements _380w{
        @Override
        public void charge_380w() {
            System.out.println("заряжает 380w");
        }
    }
    static class adapter implements _220w {
        private _380w charge;
        public adapter(_380w charge){
            this.charge = charge;
        }
        public void rurrrrrrr(){
            charge.charge_380w();
        }
        @Override
        public void charge_220w() {
            System.out.println("заряжает 220w");
        }
    }
    public static void main(String[] args) {
        _220class tut = new _220class();
        _380class wuw = new _380class();
        adapter pup = new adapter(wuw);
        pup.charge_220w();
        pup.rurrrrrrr();
    }
}

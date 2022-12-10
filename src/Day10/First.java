package Day10;


    class First extends Thread{
        Table t;
        First(Table t){
            this.t=t;
        }
        synchronized  public void run(){
            t.tab(8);
            t.tab(6);// here is the input example : 9
        }

    }
    class _2nd extends Thread{
        Table t;
        _2nd(Table t){
            this.t=t;
        }
        public void run(){
            t.tab(5);  // here is the 2nd input example : 5
        }

    }


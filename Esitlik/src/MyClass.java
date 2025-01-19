public class MyClass {

    int id ;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    String isim ;

    public MyClass(int id, String isim) {
        this.id = id;
        this.isim = isim;
    }

    @Override
    public boolean equals(Object obj) {
            if(this == obj) return true ;

            if(obj == null || getClass() != obj.getClass()) return false ;

            MyClass myClass = (MyClass) obj ;

            return id == myClass.id && isim.equals(myClass.isim);
    }
}

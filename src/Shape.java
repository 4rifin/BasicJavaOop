class Shape {
    int getCorner(){
        return 0;
    }
}
class Rectanggle extends Shape {
    int getCorner(){
        return 6;
    }

    //super keyword
    int getParentCorner(){
        return super.getCorner();
    }
}
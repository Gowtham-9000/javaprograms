package operationonintegers;

class Point {
    private double xCoordinate;
    private double yCoordinate;

    public Point(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public double getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public double getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public double calculateDistance() {
       double distance = Math.sqrt((xCoordinate-0)*(xCoordinate-0)+(yCoordinate-0)*(yCoordinate-0));
        return Math.round(distance*100)/100.0;
    }

    public double calculateDistance(Point point) {
        return Math.round(Math.sqrt(Math.pow(point.xCoordinate - xCoordinate, 2) +
                                     Math.pow(point.yCoordinate - yCoordinate, 2)) * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Point\nxCoordinate: " + this.getxCoordinate() + "\nyCoordinate: " + this.getyCoordinate();
    }
}

class Triangle {
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle() {
        point1 = new Point(0,0);
        point2 = new Point(1,1);
        point3 = new Point(2,5); 
    }

    public Triangle(double point1Xcoordinate, double point1Ycoordinate,
                    double point2Xcoordinate, double point2Ycoordinate,
                    double point3Xcoordinate, double point3Ycoordinate) {
    this.point1 = new Point(point1Xcoordinate, point1Ycoordinate);
    this.point2 = new Point(point2Xcoordinate, point2Ycoordinate);
    this.point3 = new Point(point3Xcoordinate, point3Ycoordinate);
}


    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    public double calculatePerimeter() {
        double a = point1.calculateDistance(point2);
        double b = point2.calculateDistance(point3);
        double c = point3.calculateDistance(point1);
        double perimeter = Math.round((a + b + c) * 100.0) / 100.0;
        return perimeter;
    }

    public double calculateArea() {
        double a = point1.calculateDistance(point2);
        double b = point2.calculateDistance(point3);
        double c = point3.calculateDistance(point1);
        double s = (a + b + c) / 2;
        double area = (s*(s - a)*(s - b)*(s - c));
        area =Math.round(Math.sqrt(area)*100.0)/100.0;
        return area;
        
    }
}

class MethodOverloading2 {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle(1, 2, 6, 5, 5, 1);
        
        Point point1 = new Point(2, 1);
        Point point2 = new Point(4, 4);
        Point point3 = new Point(9, 1);
        Triangle triangle3 = new Triangle(point1, point2, point3);        

        System.out.println("Perimeter of triangle1 is " + triangle1.calculatePerimeter());
        System.out.println("Area of triangle1 is " + triangle1.calculateArea());
        
        System.out.println("Perimeter of triangle2 is " + triangle2.calculatePerimeter());
        System.out.println("Area of triangle2 is " + triangle2.calculateArea());
        
        System.out.println("Perimeter of triangle3 is " + triangle3.calculatePerimeter());
        System.out.println("Area of triangle3 is " + triangle3.calculateArea());
    }
}
package najave;


public class Main {

    public static void main(String[] args) {
        animal orangutan = new animal(new type("jerozolimski"),new hair(5),new size(56,37), new country("Portugalia"), new children(10), new tail(3));
        System.out.println("type: " + orangutan.type.name );
        System.out.println("hair: " + orangutan.hair.lenght );
        System.out.println("size: " + orangutan.size.height + ", " + orangutan.size.width);
        System.out.println("country: " + orangutan.country.name );
        System.out.println("tail: " + orangutan.children.number );
        System.out.println("children: " + orangutan.tail.lenght );


        animal goryl = new animal(new type("srilankowy"),new hair(4),new size(50,50), new country("Sri Lanka"), new children(1), new tail(1));
        System.out.println("type: " + goryl.type.name );
        System.out.println("hair: " + goryl.hair.lenght);
        System.out.println("size: " + goryl.size.height + ", " + goryl.size.width);
        System.out.println("country: " + goryl.country.name );
        System.out.println("tail: " + goryl.children.number  );
        System.out.println("children: " + goryl.tail.lenght);


        animal szympans = new animal(new type("kongowy"),new hair(10),new size(45,100), new country("Kongo"), new children(7), new tail(1));
        System.out.println("type: " + szympans.type.name );
        System.out.println("hair: " + szympans.hair.lenght );
        System.out.println("size: " + szympans.size.height + ", " + szympans.size.width);
        System.out.println("country: " + szympans.country.name );
        System.out.println("tail: " + szympans.children.number  );
        System.out.println("children: " + szympans.tail.lenght );


        animal pawian = new animal(new type("rzymski"),new hair(1),new size(46,30), new country("Indie"), new children(25), new tail(5));
        System.out.println("type: " + pawian.type.name );
        System.out.println("hair: " + pawian.hair.lenght );
        System.out.println("size: " + pawian.size.height + ", " + pawian.size.width);
        System.out.println("country: " + pawian.country.name );
        System.out.println("tail: " + pawian.children.number  );
        System.out.println("children: " + pawian.tail.lenght );

        
        animal wyjec = new animal(new type("czarny"),new hair(3),new size(40,35), new country("Rosja"), new children(6), new tail(0));
        System.out.println("type: " + wyjec.type.name );
        System.out.println("hair: " + wyjec.hair.lenght );
        System.out.println("size: " + wyjec.size.height + ", " + wyjec.size.width);
        System.out.println("country: " + wyjec.country.name );
        System.out.println("tail: " + wyjec.children.number  );
        System.out.println("children: " + wyjec.tail.lenght );
    }
}

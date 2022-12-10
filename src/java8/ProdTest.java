package java8;



import java.util.Arrays;
import java.util.List;
        public class ProdTest {

            public static void main(String[] args) {

                Product p1 = new Product(101,"Iron","Electronics",100);
                Product p2 = new Product(102,"Tv","Electronics",400);
              Product p3 = new Product(103,"Biscuit","Gros",100);
               Product p4 = new Product(104,"Medicine","Medical",800);
                Product p5 = new Product(105,"AC","Electronics",1000);

                     Product p6 = new Product(106,"Fan","Electronics",50);
                List<Product> products = Arrays.asList(p1,p2,p3,p4,p5,p6);
                products.stream().filter(g ->g.getCategory()=="Electronics").forEach(n-> System.out.println(n.getProdName()));

            }
        }




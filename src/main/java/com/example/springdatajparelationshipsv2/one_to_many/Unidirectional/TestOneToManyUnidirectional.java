//package com.example.springdatajparelationshipsv2.one_to_many.Unidirectional;
//
//import com.example.springdatajparelationshipsv2.one_to_many.Unidirectional.entity.Customer;
//import com.example.springdatajparelationshipsv2.one_to_many.Unidirectional.entity.Order;
//import com.example.springdatajparelationshipsv2.one_to_many.Unidirectional.service.CustomerService;
//import com.example.springdatajparelationshipsv2.one_to_many.Unidirectional.service.OrderService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//
//@SpringBootApplication
//public class TestOneToManyUnidirectional implements CommandLineRunner {
//
//    @Autowired
//    private CustomerService customerService;
//    @Autowired
//    private OrderService orderService;
//
//    public static void main (String[] args) {
//        SpringApplication.run(TestOneToManyUnidirectional.class, args);
//    }
//
//    @Override
//    public void run (String... args) throws Exception {
//
//        //! add cusotmers
//        //Order
//        //        Order order = new Order("product", 199.0);
//        //        Order order1 = new Order("product1", 199.0);
//        //        Order order2 = new Order("produc2", 199.0);
//        //        List<Order> orderList = new ArrayList<>();
//        //        orderList.add(order);
//        //        orderList.add(order1);
//        //        orderList.add(order2);
//        //        // add Customer
//        //        Customer customer = new Customer("mohamed", "rhziza", "sirhziza@gmail.com", "sale", "066666666", orderList);
//        //        System.out.println(this.customerService.saveCustomer(customer));
//
//        //        Order order = new Order("productTest", 199.0);
//        //        System.out.println(this.orderService.saveOrder(order));
//
//
//        //        Customer customer = new Customer("mohamed", "rhziza", "sirhziza@gmail.com", "sale", "066666666", null);
//        //        System.out.println(this.customerService.saveCustomer(customer));
//
//        // get all customersl
//        System.out.println("=======  list of customers ==========");
//        for (Customer customer : this.customerService.getCustomers()) {
//            System.out.println(customer);
//        }
//        System.out.println("=======  list of orders ==========");
//        for (Order order : this.orderService.getAllOrders()) {
//            System.out.println(order);
//        }
//    }
//}

package com.example.springdatajparelationshipsv2.one_to_many.bidirectional;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//
//@SpringBootApplication
//public class TestOneToManyBidirectional implements CommandLineRunner {
//    @Autowired
//    private CustomerService customerService;
//    @Autowired
//    private OrderService orderService;
//
//    public static void main (String[] args) {
//        SpringApplication.run(TestOneToManyBidirectional.class, args);
//    }
//
//    @Override
//    public void run (String... args) throws Exception {
//! add customers
//Order
//        Order order = new Order(null, "biproduct", 199.0);
//        Order order1 = new Order(null, "biproduct1", 199.0);
//        Order order2 = new Order(null, "biproduc2", 199.0);
//        List<Order> orderList = new ArrayList<>();
//        orderList.add(order);
//        orderList.add(order1);
//        orderList.add(order2);
// add Customer
//        Customer customer = new Customer(null, "biCustomer1", "biCustomer1", "biCustomer1@gmail.com", "biCustomer1", "066666666", null);
//        System.out.println(this.customerService.saveCustomer(customer));
//        // many orders have one customer
//        Order order = new Order(null, "biproduct", 199.0, customer);
//        Order order1 = new Order(null, "biproduct1", 199.0, customer);
//        Order order2 = new Order(null, "biproduc2", 199.0, customer);
//        System.out.println(this.orderService.saveOrder(order));
//        System.out.println(this.orderService.saveOrder(order1));
//        System.out.println(this.orderService.saveOrder(order2));

//    }
//}

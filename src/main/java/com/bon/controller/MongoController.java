package com.bon.controller;

/**
 * 测试 MongoDB 的功能
 */
//@RestController
//@RequestMapping("/mongo")
public class MongoController {

//    private final MongoTemplate mongoTemplate;
//
//    @Autowired
//    public MongoController(MongoTemplate mongoTemplate) {
//        this.mongoTemplate = mongoTemplate;
//    }
//
//
//    @GetMapping(value = "/test")
//    public void mongoT1() {
//        //对象存储
//        String BASE_INFO_COLLECTION = "baseInfo";
//        JSONObject json = new JSONObject();
//        json.put("id", "123");
//        mongoTemplate.insert(json, BASE_INFO_COLLECTION);
//
//        Query query = new Query(Criteria.where("id").is("123"));
//        Long count = mongoTemplate.count(query, BASE_INFO_COLLECTION);
//        System.out.println("count=" + count);
//    }
//
//    @GetMapping(value = "/test2")
//    public void MongoT2() {
//        User user = new User();
//        user.setId(111);
//        user.setName("dou");
//        mongoTemplate.save(user);
//    }
}

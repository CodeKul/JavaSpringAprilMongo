package com.example.javaaprilmongo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SampleRepository extends MongoRepository<Sample,String> {
}
//https://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@github.com/CodeKul/JavaSpringAprilMongo.git
/**
 *
 * > use javaapril;
 * switched to db javaapril
 * > show collections;
 * > show collection;
 * uncaught exception: Error: don't know how to show [collection] :
 * shellHelper.show@src/mongo/shell/utils.js:1191:11
 * shellHelper@src/mongo/shell/utils.js:819:15
 * @(shellhelp2):1:1
 * > show collections;
 * > show dbs;
 * admin   0.000GB
 * config  0.000GB
 * local   0.000GB
 * > show collections;
 * > use javaapril
 * switched to db javaapril
 * > show collections
 * > show collections
 * sample
 * > db.sample.find();
 * { "_id" : ObjectId("630db7531adc981f91e23078"), "name" : "Rahul", "address" : "Pune", "_class" : "com.example.javaaprilmongo.Sample" }
 * > db.sample.find(),pretty();
 * uncaught exception: ReferenceError: pretty is not defined :
 * @(shell):1:18
 * > db.sample.find().pretty();
 * {
 * 	"_id" : ObjectId("630db7531adc981f91e23078"),
 * 	"name" : "Rahul",
 * 	"address" : "Pune",
 * 	"_class" : "com.example.javaaprilmongo.Sample"
 * }
 * >
 */
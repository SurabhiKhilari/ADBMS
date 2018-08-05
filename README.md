# ADBMS
Advanced Database Management System: Health Analyzer

What does the project do?
	The social web mining application is called “Smoking Analyser”. It is an application built to analyse and form graphs according to the smoking traits taking into account various factors of a person’s characteristics. The database consists of 1339 instances of people and each instance has 8 attributes like the age, sex, region, smoking habits, etc of a particular person. It is a multivariate dataset. I am using Apache’s Cassandra as our NoSQL Database as our back end. This Cassandra database is connected using Java programming language and we have used K-Means Clustering Algorithm as our machine learning algorithm to extract information from the Cassandra’s database using java yet again. We have already learnt in theory about all these technologies, therefore the main purpose of implementing this project is to use our theoretical knowledge and get a hands-on experience of the recent trends in IT. The main idea is to use KMeans Clustering algorithm as well as KNN Clustering algorithm and analyse to the smoking traits taking into account various factors of a person’s characteristics. I have also learnt how different it is to implement a social web mining application which needs to query a huge data in a very short time than a normal database application.  
Why is it useful?
When it comes to a social web mining application, we need a system or application that query’s a huge volume of data or Big Data in a very short time or real-time, making it different than a normal software which looks after a typically small dataset and does not need results in real time. Thus, to suffice all the social web mining application’s needs we make use of technologies like Java, NoSQL Database: Cassandra, KNN Clustering Algorithm, and K-Means Clustering Algorithm.  Our social web mining application is called “Smoking Analyser”. It is an application built to analyse and form graphs according to the smoking traits taking into account various factors of a person’s characteristics. Our database consists of 1339 instances of people and each instance has 8 attributes like the age, sex, region, smoking habits, etc of a particular person. The main idea is to use K-Means Clustering algorithm and analyse to the smoking traits taking into account various factors of a person’s characteristics and showcase a graph for the analysis. This will help to understand whether a particular person is healthy, if not what is affecting the health and the counter measures to be taken.
How can users get started with the project?
	Technologies and how they are used: 
1)	Java :  Connecting NetBeans’ front end and Cassandra’s Database.
2)	NoSQL Database
3)	Apache Cassandra: The Apache Cassandra database is the right choice when you need scalability and high availability without compromising performance. Linear scalability and proven fault-tolerance on commodity hardware or cloud infrastructure make it the perfect platform for mission-critical data. Cassandra's support for replicating across multiple datacentres is best-in-class, providing lower latency for users and the peace of mind of knowing that you can survive regional outages. Apache Cassandra is a free and open source distributed NoSQL database management system designed to handle large amounts of data across many commodity servers, providing high availability with no single point of failure. 
1. Command for Creating Keyspace: CREATE KEYSPACE Insurance WITH replication = {'class':'SimpleStrategy', 'replication_factor':1}; 
2. Command for Creating table: CREATE TABLE medical (uid int, age int, sex text, bmi float, children int, smoker text, region text, charges float, PRIMARY KEY((uid),sex, smoker,region));  
3. Copy command for importing records from CSV file to database table: COPY medical(uid, age, bmi, children, region, sex, smoker) FROM 'D:\insurance.csv';
4. Contents of Table “medical”: SELECT * from medical LIMIT 5;
4) K-Means Clustering Algorithm
5) K-Nearest Neighbors Algorithm
6) NetBeans IDE: for the front end.
Sources to get help?
https://www.kaggle.com/annetxu/health-insurance-cost-predicition 
http://www.baeldung.com/cassandra-with-java 
https://github.com/datastax/java-driver 
https://www.youtube.com/watch?v=JZTIIchUa6E 
https://www.tutorialspoint.com/cassandra/ 
https://www.tutorialspoint.com/jfreechart/jfreechart_pie_chart.htm 
https://dba.stackexchange.com/questions/55165/cassandra-query-a-column-with-collectiontype 
https://docs.datastax.com/en/cql/3.1/cql/cql_reference/alter_table_r.html



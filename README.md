# Hibernate @Fetch(FetchMode.JOIN)

The original idea is from  
https://levelup.gitconnected.com/optimizing-database-performance-in-spring-boot-leveraging-hibernate-listeners-for-efficient-query-bed0c4a6b7c1

This example demonstrates that using Hibernate's PostLoadEventListener does not really solve the N+1 select problem



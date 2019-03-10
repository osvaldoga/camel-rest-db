1. Docker
Docker MySQL
 
 * Download docker mysql
 ```
 $ docker pull mysql
 ```

* Run container
 ```
 $ docker run --name container-mysql -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=mysql_password -e MYSQL_DATABASE=demo -e MYSQL_USER=mysql -e MYSQL_PASSWORD=mysql_password  mysql:latest
 ```


2. Rest Demo

3. Camel Demo
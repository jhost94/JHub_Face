if [ -z "$1" ]; then
  mvn clean install && java -jar target/*.jar --spring.profiles.active=local_dev
else
  mvn clean install && java -jar target/*.jar --spring.profiles.active="$1"
fi
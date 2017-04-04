## Reference
    http://spark.apache.org/docs/latest/quick-start.html

## Create new sbt projet
    $ sbt new sbt/scala-seed.g8


## Create Package
    $ sbt packaget
    create package <project_foler>/target/scala-2.11/simple-app_2.11-0.1.jar 

## Run 
    $ spark-submit --class "SimpleApp" --master local[4] target/scala-2.11/simple-app_2.11-0.1.jar


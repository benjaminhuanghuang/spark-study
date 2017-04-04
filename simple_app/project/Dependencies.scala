import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.1"
  
  object Libraries {
    val sparkCore    = "org.apache.spark"           %% "spark-core"            % V.spark        % "provided"
    val sparkMllib   = "org.apache.spark"           %% "spark-mllib"           % V.spark        % "provided"
    val sparkSql     = "org.apache.spark"           %% "spark-sql"             % V.spark        % "provided"
    // Add additional libraries from mvnrepository.com (SBT syntax) here...

    // Scala (test only)
    val specs2       = "org.specs2"                 %% "specs2"                % V.specs2       % "test"
    // Java (test only)
    val guava        = "com.google.guava"           %  "guava"                 % V.guava        % "test"
  }
}

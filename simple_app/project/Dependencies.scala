import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.1"
  
  val resolutionRepos = Seq(
    "Akka Repository" at "http://repo.akka.io/releases/",
    "Spray Repository" at "http://repo.spray.cc/"
  )
  
  object V {
    val spark     = "1.6.0"
    val specs2    = "1.13"
    val guava     = "11.0.1"
    // Add versions for your additional libraries here...
  }

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

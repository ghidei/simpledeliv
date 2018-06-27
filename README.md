# Template to run [ldfi-akka](https://github.com/KTH/ldfi-akka)

1. Checkout fresh branch
	
	`git checkout -b <branch_name>`

2. Clone ldfi-akka to branch root
	
	`git clone https://github.com/KTH/ldfi-akka.git`

3. Add the following dependency to build.sbt
	
	```			
	lazy val ldfiakka = (project in file ("ldfi-akka"))	
	.settings(
		name := "ldfi-akka",
		mainClass in Compile := Some("ldfi.akka.Main"))
	.dependsOn(global)
	```
4. Compile project

	`sbt compile`

5. Copy code in to ldfi-akka

	`sbt "ldfiakka/runMain ldfi.akka.Main --copy src/main/scala"`

6. Compile ldfi-akka

	`(cd ldfi-akka; sbt compile)`

7. Rewrite code 

	`sbt "ldfiakka/runMain ldfi.akka.Main --rewrite"`

6. Compile ldfi-akka
	
	`(cd ldfi-akka; sbt compile)`

9. Run ldfi-akka

	`sbt "ldfiakka/runMain ldfi.akka.Main -m src/main/scala/simpledeliv/Main.scala -v src/main/scala/simpledeliv/Main.scala verifyCorrectness"`

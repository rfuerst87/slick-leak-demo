package db

import javax.inject.Inject

import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import slick.driver.JdbcProfile

class FooDb @Inject()(protected val dbConfigProvider: DatabaseConfigProvider)
  extends HasDatabaseConfigProvider[JdbcProfile] {
  import driver.api._

  class FooTable(tag: Tag) extends Table[(Long, String, String)](tag, "person") {
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
    def firstName = column[String]("first_name")
    def lastName = column[String]("last_name")

    def * = (id, firstName, lastName)
  }

  val query = TableQuery[FooTable]
  def findAll() = db.run(query.result)
}
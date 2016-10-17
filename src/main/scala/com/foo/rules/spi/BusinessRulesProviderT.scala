/**
 *  Copyright ©2016, Pathfinder Group, Ltd. All Rights Reserved.
 */
package com.foo.rules.spi

import java.time.LocalDate
import scala.collection.immutable.Seq

/**
  * Service provider interface for business rules services.
  */
trait BusinessRulesProviderT {

  /**
    * Version of the implementation.
    * @return version
    */
  def version: String

  /**
    * Release date of the implementation
    * @return date of the release
    */
  def releaseDate: LocalDate

  /**
    * Returns a sequence of business rules.
    * @return
    */
  def rules:Seq[BusinessRuleT]

}





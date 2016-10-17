/**
 *  Copyright ©2016, Pathfinder Group, Ltd. All Rights Reserved.
 */
package com.foo.rules.spi

import com.pathfinder.wire.read.domain.model.OutgoingWire

// Business Exception Status ADT
sealed trait BusinessExceptionStatus {
  def msg:Option[String]
}
final case class ExceptionSuccess(msg:Option[String] = None) extends BusinessExceptionStatus
final case class ExceptionFailure(msg:Option[String] = None) extends BusinessExceptionStatus
final case class ExceptionOverridden(msg:Option[String] = None) extends BusinessExceptionStatus
final case class ExceptionInProcess(msg:Option[String] = None) extends BusinessExceptionStatus
final case class ExceptionInitialized(msg:Option[String] = None) extends BusinessExceptionStatus

trait BusinessRuleT {

  def execute(wire: OutgoingWire): BusinessExceptionStatus

  def description:String

  def shortName:String

}


// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package person

sealed trait Gender extends _root_.scalapb.GeneratedEnum {
  type EnumType = Gender
  def isMale: _root_.scala.Boolean = false
  def isFemale: _root_.scala.Boolean = false
  def companion: _root_.scalapb.GeneratedEnumCompanion[Gender] = person.Gender
}

object Gender extends _root_.scalapb.GeneratedEnumCompanion[Gender] {
  implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[Gender] = this
  @SerialVersionUID(0L)
  case object MALE extends Gender {
    val value = 0
    val index = 0
    val name = "MALE"
    override def isMale: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object FEMALE extends Gender {
    val value = 1
    val index = 1
    val name = "FEMALE"
    override def isFemale: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  final case class Unrecognized(value: _root_.scala.Int) extends Gender with _root_.scalapb.UnrecognizedEnum
  
  lazy val values = scala.collection.Seq(MALE, FEMALE)
  def fromValue(value: _root_.scala.Int): Gender = value match {
    case 0 => MALE
    case 1 => FEMALE
    case __other => Unrecognized(__other)
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = PersonProto.javaDescriptor.getEnumTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = PersonProto.scalaDescriptor.enums(0)
}
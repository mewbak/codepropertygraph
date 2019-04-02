package io.shiftleft.queryprimitives.steps.types.propertyaccessors

import io.shiftleft.codepropertygraph.generated.NodeKeys
import io.shiftleft.codepropertygraph.generated.nodes.StoredNode
import io.shiftleft.queryprimitives.steps.Steps
import shapeless.HList

trait DispatchTypeAccessors[T <: StoredNode, Labels <: HList] extends StringPropertyAccessors[T, Labels] {

  /**
    * Traverse to dispatchType
    * */
  def dispatchType(): Steps[String, Labels] =
    stringProperty(NodeKeys.DISPATCH_TYPE)

  /**
    * Traverse to nodes where the dispatchType matches the regular expression `value`
    * */
  def dispatchType(value: String): Steps[T, Labels] =
    stringPropertyFilter(NodeKeys.DISPATCH_TYPE, value)

  /**
    * Traverse to nodes where the dispatchType matches at least one of the regular expressions in `values`
    * */
  def dispatchType(value: String*): Steps[T, Labels] =
    stringPropertyFilterMultiple(NodeKeys.DISPATCH_TYPE, value: _*)

  /**
    * Traverse to nodes where dispatchType matches `value` exactly.
    * */
  def dispatchTypeExact(value: String): Steps[T, Labels] =
    stringPropertyFilterExact(NodeKeys.DISPATCH_TYPE, value)

  /**
    * Traverse to nodes where dispatchType matches one of the elements in `values` exactly.
    * */
  def dispatchTypeExact(values: String*): Steps[T, Labels] =
    stringPropertyFilterExactMultiple(NodeKeys.DISPATCH_TYPE, values: _*)

  /**
    * Traverse to nodes where dispatchType does not match the regular expression `value`.
    * */
  def dispatchTypeNot(value: String): Steps[T, Labels] =
    stringPropertyFilterNot(NodeKeys.DISPATCH_TYPE, value)

  /**
    * Traverse to nodes where dispatchType does not match any of the regular expressions in `values`.
    * */
  def dispatchTypeNot(values: String*): Steps[T, Labels] =
    stringPropertyFilterNotMultiple(NodeKeys.DISPATCH_TYPE, values: _*)

}

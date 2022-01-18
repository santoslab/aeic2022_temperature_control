// #Sireum

package t.TemperatureControl

import org.sireum._
import t._

// This file will not be overwritten so is safe to edit
object TempControl_i_tcp_tempControl {

  def initialise(api: TempControl_i_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_fanCmd(TemperatureControl.FanCmd.byOrdinal(0).get)
  }

  def handle_fanAck(api: TempControl_i_Operational_Api, value : TemperatureControl.FanAck.Type): Unit = {
    api.logInfo("example handle_fanAck implementation")
    api.logInfo(s"received ${value}")
    // example api usage

    val apiUsage_currentTemp: Option[TemperatureControl.Temperature_i] = api.get_currentTemp()
    api.logInfo(s"Received on currentTemp: ${apiUsage_currentTemp}")
    val apiUsage_fanAck: Option[TemperatureControl.FanAck.Type] = api.get_fanAck()
    api.logInfo(s"Received on fanAck: ${apiUsage_fanAck}")
    val apiUsage_setPoint: Option[TemperatureControl.SetPoint_i] = api.get_setPoint()
    api.logInfo(s"Received on setPoint: ${apiUsage_setPoint}")
    val apiUsage_tempChanged: Option[art.Empty] = api.get_tempChanged()
    api.logInfo(s"Received on tempChanged: ${apiUsage_tempChanged}")
  }

  def handle_setPoint(api: TempControl_i_Operational_Api, value : TemperatureControl.SetPoint_i): Unit = {
    api.logInfo("example handle_setPoint implementation")
    api.logInfo(s"received ${value}")
  }

  def handle_tempChanged(api: TempControl_i_Operational_Api): Unit = {
    api.logInfo("example handle_tempChanged implementation")
    api.logInfo("received tempChanged event")
  }

  def activate(api: TempControl_i_Operational_Api): Unit = { }

  def deactivate(api: TempControl_i_Operational_Api): Unit = { }

  def finalise(api: TempControl_i_Operational_Api): Unit = { }

  def recover(api: TempControl_i_Operational_Api): Unit = { }
}

// #Sireum

package t

import org.sireum._
import art._
import art.scheduling.nop.NopScheduler

// This file was auto-generated.  Do not edit

object TempControl_i_tcp_tempControl_App extends App {

  val entryPoints: Bridge.EntryPoints = Arch.TempControlSystem_i_Instance_tcp_tempControl.entryPoints
  val appPortId: Art.PortId = IPCPorts.TempControl_i_tcp_tempControl_App
  val appPortIdOpt: Option[Art.PortId] = Some(appPortId)
  val currentTempPortId: Art.PortId = Arch.TempControlSystem_i_Instance_tcp_tempControl.currentTemp.id
  val currentTempPortIdOpt: Option[Art.PortId] = Some(currentTempPortId)
  val fanAckPortId: Art.PortId = Arch.TempControlSystem_i_Instance_tcp_tempControl.fanAck.id
  val fanAckPortIdOpt: Option[Art.PortId] = Some(fanAckPortId)
  val setPointPortId: Art.PortId = Arch.TempControlSystem_i_Instance_tcp_tempControl.setPoint.id
  val setPointPortIdOpt: Option[Art.PortId] = Some(setPointPortId)
  val tempChangedPortId: Art.PortId = Arch.TempControlSystem_i_Instance_tcp_tempControl.tempChanged.id
  val tempChangedPortIdOpt: Option[Art.PortId] = Some(tempChangedPortId)

  def initialiseArchitecture(seed: Z): Unit = {
    Platform.initialise(seed, appPortIdOpt)
    Platform.initialise(seed, currentTempPortIdOpt)
    Platform.initialise(seed, fanAckPortIdOpt)
    Platform.initialise(seed, setPointPortIdOpt)
    Platform.initialise(seed, tempChangedPortIdOpt)

    Art.run(Arch.ad, NopScheduler())
  }

  def initialise(): Unit = {
    entryPoints.initialise()
  }

  def compute(): Unit = {
    var dispatch = F

    {
      val out = IPCPorts.emptyReceiveAsyncOut
      Platform.receiveAsync(currentTempPortIdOpt, out)
      out.value2 match {
        case Some(v: TemperatureControl.Temperature_i_Payload) => ArtNix.updateData(currentTempPortId, v); dispatch = F
        case Some(v) => halt(s"Unexpected payload on port currentTemp.  Expecting something of type TemperatureControl.Temperature_i_Payload but received ${v}")
        case None() => // do nothing
      }
    }
    {
      val out = IPCPorts.emptyReceiveAsyncOut
      Platform.receiveAsync(fanAckPortIdOpt, out)
      out.value2 match {
        case Some(v: TemperatureControl.FanAck_Payload) => ArtNix.updateData(fanAckPortId, v); dispatch = T
        case Some(v) => halt(s"Unexpected payload on port fanAck.  Expecting something of type TemperatureControl.FanAck_Payload but received ${v}")
        case None() => // do nothing
      }
    }
    {
      val out = IPCPorts.emptyReceiveAsyncOut
      Platform.receiveAsync(setPointPortIdOpt, out)
      out.value2 match {
        case Some(v: TemperatureControl.SetPoint_i_Payload) => ArtNix.updateData(setPointPortId, v); dispatch = T
        case Some(v) => halt(s"Unexpected payload on port setPoint.  Expecting something of type TemperatureControl.SetPoint_i_Payload but received ${v}")
        case None() => // do nothing
      }
    }
    {
      val out = IPCPorts.emptyReceiveAsyncOut
      Platform.receiveAsync(tempChangedPortIdOpt, out)
      out.value2 match {
        case Some(v: art.Empty) => ArtNix.updateData(tempChangedPortId, v); dispatch = T
        case Some(v) => halt(s"Unexpected payload on port tempChanged.  Expecting something of type art.Empty but received ${v}")
        case None() => // do nothing
      }
    }
    if (dispatch) {
      entryPoints.compute()
      t.Process.sleep(1)
    } else {
      t.Process.sleep(10)
    }
  }

  def finalise(): Unit = {
    entryPoints.finalise()
  }

  def main(args: ISZ[String]): Z = {

    val seed: Z = if (args.size == z"1") {
      val n = Z(args(0)).get
      if (n == z"0") 1 else n
    } else {
      1
    }

    initialiseArchitecture(seed)

    Platform.receive(appPortIdOpt, IPCPorts.emptyReceiveOut) // pause after setting up component

    initialise()

    Platform.receive(appPortIdOpt, IPCPorts.emptyReceiveOut) // pause after component init

    println("TempControl_i_tcp_tempControl_App starting ...")

    ArtNix.eventDispatch()

    var terminated = F
    while (!terminated) {
      val out = IPCPorts.emptyReceiveAsyncOut
      Platform.receiveAsync(appPortIdOpt, out)
      if (out.value2.isEmpty) {
        compute()
      } else {
        terminated = T
      }
    }
    exit()

    touch()

    return 0
  }

  def touch(): Unit = {
    if(F) {
      TranspilerToucher.touch()

      // add types used in Platform.receive and Platform.receiveAsync
      val mbox2Boolean_Payload: MBox2[Art.PortId, DataContent] = MBox2(0, Base_Types.Boolean_Payload(T))
      val mbox2OptionDataContent: MBox2[Art.PortId, Option[DataContent]] = MBox2(0, None())

      // touch each payload/type in case some are only used as a field in a record
      def printDataContent(a: art.DataContent): Unit = { println(s"${a}") }

      printDataContent(Base_Types.Float_32_Payload(Base_Types.Float_32_example()))
      printDataContent(TemperatureControl.TempUnit_Payload(TemperatureControl.TempUnit.byOrdinal(0).get))
      printDataContent(TemperatureControl.Temperature_i_Payload(TemperatureControl.Temperature_i.example()))
      printDataContent(TemperatureControl.SetPoint_i_Payload(TemperatureControl.SetPoint_i.example()))
      printDataContent(TemperatureControl.FanAck_Payload(TemperatureControl.FanAck.byOrdinal(0).get))
      printDataContent(TemperatureControl.FanCmd_Payload(TemperatureControl.FanCmd.byOrdinal(0).get))
      printDataContent(art.Empty())

      t.TemperatureControl.TempControl_i_tcp_tempControl_Bridge.c_initialization_api.get.logInfo("")
      t.TemperatureControl.TempControl_i_tcp_tempControl_Bridge.c_initialization_api.get.logDebug("")
      t.TemperatureControl.TempControl_i_tcp_tempControl_Bridge.c_initialization_api.get.logError("")
      t.TemperatureControl.TempControl_i_tcp_tempControl_Bridge.c_operational_api.get.logInfo("")
      t.TemperatureControl.TempControl_i_tcp_tempControl_Bridge.c_operational_api.get.logDebug("")
      t.TemperatureControl.TempControl_i_tcp_tempControl_Bridge.c_operational_api.get.logError("")
      val apiUsage_currentTemp: Option[TemperatureControl.Temperature_i] = t.TemperatureControl.TempControl_i_tcp_tempControl_Bridge.c_operational_api.get.get_currentTemp()
      val apiUsage_fanAck: Option[TemperatureControl.FanAck.Type] = t.TemperatureControl.TempControl_i_tcp_tempControl_Bridge.c_operational_api.get.get_fanAck()
      val apiUsage_setPoint: Option[TemperatureControl.SetPoint_i] = t.TemperatureControl.TempControl_i_tcp_tempControl_Bridge.c_operational_api.get.get_setPoint()
      t.TemperatureControl.TempControl_i_tcp_tempControl_Bridge.c_initialization_api.get.put_fanCmd(TemperatureControl.FanCmd.byOrdinal(0).get)
      t.TemperatureControl.TempControl_i_tcp_tempControl_Bridge.c_operational_api.get.put_fanCmd(TemperatureControl.FanCmd.byOrdinal(0).get)
      val apiUsage_tempChanged: Option[art.Empty] = t.TemperatureControl.TempControl_i_tcp_tempControl_Bridge.c_operational_api.get.get_tempChanged()
    }
  }

  def exit(): Unit = {
    finalise()
    Platform.finalise()
  }

  override def atExit(): Unit = {
    exit()
  }
}
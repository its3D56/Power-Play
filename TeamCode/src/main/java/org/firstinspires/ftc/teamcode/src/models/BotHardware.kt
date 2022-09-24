package org.firstinspires.ftc.teamcode.src.models

import com.qualcomm.robotcore.hardware.DcMotor
import com.qualcomm.robotcore.hardware.Gamepad
import com.qualcomm.robotcore.hardware.HardwareMap

open class BotHardware {
    class Wheels(hardware: HardwareMap) {
        var fl = hardware.get("FL") as DcMotor
        var fr = hardware.get("FR") as DcMotor
        var br = hardware.get("BR") as DcMotor
        var bl = hardware.get("BL") as DcMotor
    }
    class Controls (gamepad: Gamepad) {
        var forward = -gamepad.left_stick_y.toDouble()
        var pivot = gamepad.left_stick_x.toDouble()
    }
}

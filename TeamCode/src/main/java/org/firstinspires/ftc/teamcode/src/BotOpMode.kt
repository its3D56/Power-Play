package org.firstinspires.ftc.teamcode.src

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode
import com.qualcomm.robotcore.eventloop.opmode.TeleOp
import com.qualcomm.robotcore.hardware.DcMotorSimple
import com.qualcomm.robotcore.util.Range
import org.firstinspires.ftc.teamcode.src.models.BotHardware

@TeleOp(name = "TeleOp Mode", group = "OpMode")
class BotOpMode: LinearOpMode() {
    override fun runOpMode() {
        val bot = BotHardware.Wheels(hardwareMap)
        val player1 = BotHardware.Controls(gamepad1)

        bot.fl.direction = DcMotorSimple.Direction.FORWARD
        bot.fr.direction = DcMotorSimple.Direction.REVERSE
        bot.bl.direction = DcMotorSimple.Direction.FORWARD
        bot.br.direction = DcMotorSimple.Direction.REVERSE

        telemetry.addData("Status:", "Initialised")

        waitForStart()
        while(opModeIsActive()) {
            telemetry.addData("Status:", "Is Running")

            val leftPower = Range.clip(player1.forward + player1.pivot, -1.0, 1.0)
            val rightPower = Range.clip(player1.forward - player1.pivot, -1.0, 1.0)

            bot.fl.power = leftPower
            bot.fr.power = rightPower
            bot.bl.power = leftPower
            bot.br.power = rightPower

            telemetry.update()
        }
    }
}
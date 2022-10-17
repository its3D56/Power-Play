package org.firstinspires.ftc.teamcode.src

import com.qualcomm.robotcore.eventloop.opmode.Autonomous
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode
import com.qualcomm.robotcore.hardware.DcMotor
import com.qualcomm.robotcore.hardware.DcMotorSimple
import org.firstinspires.ftc.teamcode.src.models.BotHardware

@Autonomous(name = "Autonomous Mode", group = "Autonomous")
class BotAuto: LinearOpMode() {
    override fun runOpMode() {
        val bot = BotHardware.Wheels(hardwareMap)

        bot.fl.direction = DcMotorSimple.Direction.FORWARD
        bot.fr.direction = DcMotorSimple.Direction.REVERSE
        bot.bl.direction = DcMotorSimple.Direction.FORWARD
        bot.br.direction = DcMotorSimple.Direction.REVERSE

        bot.fl.mode = DcMotor.RunMode.STOP_AND_RESET_ENCODER
        bot.fr.mode = DcMotor.RunMode.STOP_AND_RESET_ENCODER
        bot.bl.mode = DcMotor.RunMode.STOP_AND_RESET_ENCODER
        bot.br.mode = DcMotor.RunMode.STOP_AND_RESET_ENCODER

        bot.fl.mode = DcMotor.RunMode.RUN_USING_ENCODER
        bot.fr.mode = DcMotor.RunMode.RUN_USING_ENCODER
        bot.bl.mode = DcMotor.RunMode.RUN_USING_ENCODER
        bot.br.mode = DcMotor.RunMode.RUN_USING_ENCODER
    }
}

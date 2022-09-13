package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.robotcore.internal.ui.GamepadUser;

public class botJavaOpMode extends LinearOpMode {
    private DcMotor leftMotor;
    private DcMotor rightMotor;

    @Override
    public void runOpMode() {
        leftMotor = hardwareMap.get(DcMotor.class, "motorTest");
        rightMotor = hardwareMap.get(DcMotor.class, "motorTest");

        telemetry.appData("Status", "Initialized");
        telemetry.update();

        waitForStart();

        while (opModeIsActive()) {
            telemetry.addData("Status", "Running");
            if (Gamepad()) {
                final String user = GamepadUser.getUser();
                telemetry.addData("User", user);
            }
            telemetry.update();
        }
    }
}

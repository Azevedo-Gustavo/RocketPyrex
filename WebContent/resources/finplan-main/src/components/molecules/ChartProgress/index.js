import { Progress } from "antd";

const ChartProgress = ({
  description,
  fontSize,
  background,
  colorText,
  widthRaio,
}) => {


  return (
    <Progress
      width={154}
      format={() => descriptionFormat}
      strokeWidth={0}
      strokeLinecap="round"
      trailColor="var(--neutral-500)"
      gapPosition="bottom"
    />
  );
};

export default ChartProgress;

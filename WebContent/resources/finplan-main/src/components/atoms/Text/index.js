import { conversionPixelToRem } from "../../../utils/functions";

const Text = ({ size = 16, padding = [0, 0], color, children }) => {
  return (
    <div
      style={{
        fontSize: `${conversionPixelToRem(size)}rem`,
        color: `var(--neutral-${color})`,
        padding: `${conversionPixelToRem(padding[0])}rem ${conversionPixelToRem(
          padding[1]
        )}rem`,
      }}
    >
      {children}
    </div>
  );
};

export default Text;

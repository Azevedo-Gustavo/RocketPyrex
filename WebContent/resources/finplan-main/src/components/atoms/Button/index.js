import S from "./styles.module.scss";

const Button = ({ type = "primary", children, ...props }) => {
  const style = {
    primary: S.primary,
    secondary: S.secondary,
  };

  const classButton = style[type];

  return (
    <button type={type} className={`${S.button} ${classButton}`} {...props}>
      {children}
    </button>
  );
};

export default Button;

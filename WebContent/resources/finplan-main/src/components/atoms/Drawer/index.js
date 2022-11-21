import { AiOutlineClose } from "react-icons/ai";

import S from "./styles.module.scss";

const Drawer = ({ open, close, title, children }) => {
  return (
    <>
      <div className={`${S.background} ${open && S.isActive}`} />
      <div className={`${S.container} ${open && S.isActive}`}>
        <div className={S.header}>
          {title}
          <AiOutlineClose size={20} onClick={close} className={S.icon} />
        </div>
        <div>{children}</div>
      </div>
    </>
  );
};

export default Drawer;

import { Link } from "react-router-dom";
import S from "./styles.module.scss";

const Back = ({ to }) => {
  return (
    <div>
      <Link to={to} className={S.arrow}>
        <img src="./assets/arrow.svg" alt="Voltar" />
      </Link>
    </div>
  );
};

export default Back;

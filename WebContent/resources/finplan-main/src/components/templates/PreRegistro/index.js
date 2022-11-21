import S from "./styles.module.scss";
import { Link } from "react-router-dom";

import Apresentacao from "../../molecules/Apresentacao";
import Button from "../../atoms/Button";
import Back from "../../atoms/Back";

const PreRegister = () => {
  return (
    <div className={S.container}>
      <Back to="/" />
      <Apresentacao />
      <Link to="/cadastro">
        <Button>Continuar</Button>
      </Link>
    </div>
  );
};

export default PreRegister;

import S from "./styles.module.scss";

import Text from "../../atoms/Text";
import { AiOutlineRight } from "react-icons/ai";

const card = {
  receitas: {
    title: "Receitas",
  },
  despesas: {
    title: "Despesas",
  },
};

const Card = ({ type, value }) => {
  const style = {
    receitas: S.receitas,
    despesas: S.despesas,
  };

  const classCard = style[type];

  return (
    <div className={`${S.card} ${classCard}`}>
      <div className={`${S.container}`}>
        <div>
          <Text size={12}>{card[type]?.title}</Text>
          <Text>
            <strong> R$ {value}</strong>
          </Text>
        </div>

        <div className="d-flex justify-content-between align-items-center">
          <Text size={12}>Ver extrato</Text>
          <AiOutlineRight />
        </div>
      </div>
    </div>
  );
};

export default Card;
